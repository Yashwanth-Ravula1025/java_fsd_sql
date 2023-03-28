function findPairs() {
    const input = document.getElementById("input").value.trim();
    const target = parseInt(document.getElementById("target").value);
    
    const numbers = input.split(",").map((num) => parseInt(num.trim()));
    
    let pairs = [];
    
    for (let i = 0; i < numbers.length; i++) {
      for (let j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] === target) {
          pairs.push([numbers[i], numbers[j]]);
        }
      }
    }
    
    let result = "";
    
    if (pairs.length > 0) {
      result = "Pairs that add up to the target number:<br>";
      
      for (let pair of pairs) {
        result += `${pair[0]} and ${pair[1]}<br>`;
      }
    } else {
      result = "No pairs add up to the target number.";
    }
    
    const resultElement = document.getElementById("result");
    resultElement.innerHTML = result;
  }