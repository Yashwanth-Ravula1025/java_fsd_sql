

function romanToNumber(roman) {
    const romanNumerals = {
      I: 1,
      IV: 4,
      V: 5,
      IX: 9,
      X: 10,
      XL: 40,
      L: 50,
      XC: 90,
      C: 100,
      CD: 400,
      D: 500,
      CM: 900,
      M: 1000,
    };
    
    let result = 0;
    
    for (let i = 0; i < roman.length; i++) {
      const currentNumeral = romanNumerals[roman[i]];
      const nextNumeral = romanNumerals[roman[i + 1]];
      
      if (nextNumeral && currentNumeral < nextNumeral) {
        result -= currentNumeral;
      } else {
        result += currentNumeral;
      }
    }
    
    return result;
  }
  
  function convert() {
    const romanInput = document.getElementById("roman-input").value;
    const result = romanToNumber(romanInput);
    
    const resultElement = document.getElementById("result");
    resultElement.innerText = `${romanInput} = ${result}`;
  }