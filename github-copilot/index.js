function validarCartao(numeroCartao) {
  numeroCartao = numeroCartao.replace(/\s|-/g, "");
  const bandeiras = [
    { nome: "MasterCard", regex: /^5[1-5][0-9]{14}$/ },
    { nome: "Visa", regex: /^4[0-9]{12}(?:[0-9]{3})?$/ },
    { nome: "American Express", regex: /^3[47][0-9]{13}$/ },
    { nome: "Diners Club", regex: /^3(?:0[0-5]|[68][0-9])[0-9]{11}$/ },
    { nome: "Discover", regex: /^6(?:011|5[0-9]{2})[0-9]{12}$/ },
    { nome: "EnRoute", regex: /^(2014|2149)[0-9]{11}$/ },
    { nome: "JCB", regex: /^(?:2131|1800|35\d{3})\d{11}$/ },
    { nome: "Voyager", regex: /^8699[0-9]{11}$/ },
    { nome: "HiperCard", regex: /^(606282|3841)[0-9]{10,13}$/ },
    { nome: "Aura", regex: /^50[0-9]{14,17}$/ },
  ];

  // Função para validar o número do cartão usando o algoritmo de Luhn
  function validarLuhn(numero) {
    let soma = 0;
    let alternar = false;
    for (let i = numero.length - 1; i >= 0; i--) {
      let digito = parseInt(numero[i], 10);
      if (alternar) {
        digito *= 2;
        if (digito > 9) digito -= 9;
      }
      soma += digito;
      alternar = !alternar;
    }
    return soma % 10 === 0;
  }

  // Verifica a bandeira e valida o número
  for (const bandeira of bandeiras) {
    if (bandeira.regex.test(numeroCartao)) {
      const valido = validarLuhn(numeroCartao);
      return {
        valido,
        bandeira: valido ? bandeira.nome : null,
      };
    }
  }

  return { valido: false, bandeira: null };
}

// Exemplo de uso:
const numeroCartao = "5408 4751 5502 1810"; // Substitua pelo número do cartão
const resultado = validarCartao(numeroCartao);
console.log(resultado); // { valido: true, bandeira: 'MasterCard' }
