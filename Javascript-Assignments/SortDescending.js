function sortDescending(arr) {

    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap elements if they are in the wrong order
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    return arr;
}

let inputArray = prompt("Enter an array of numbers separated by commas:").split(",").map(Number);
let sortedArray = sortDescending(inputArray);
console.log(sortedArray);
