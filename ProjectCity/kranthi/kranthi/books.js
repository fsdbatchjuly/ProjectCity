
booksistElement = document.getElementById("bookslist");

function formbooksUI(booksNamesList){
    for(i=0;i<booksNamesList.length;i++){
        console.log("Elements are creating");
        booksDiv = document.createElement("div");
        booksDiv.classList.add("books");
    
        headEle = document.createElement("h3");
        headEle.textContent = booksNamesList[i].id
        p1Ele = document.createElement("p");
        p1Ele.textContent = booksNamesList[i].books_name;
        p2Ele = document.createElement("p");
        p2Ele.textContent = booksNamesList[i].books_price;
    
    
        booksDiv.appendChild(headEle);
        booksiv.appendChild(p1Ele);
        booksDiv.appendChild(p2Ele);
    
    
        booksListElement.appendChild(booksDiv);
    }
}



// Define the API URL you want to call
const apiUrl = 'https://api.example.com/books/123';

// Make a GET request to the API
fetch(apiUrl)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json(); // Assuming the response is in JSON format
  })
  .then(data => {
    console.log("Reading json respnse")
    formbooksUI(data.data)
  })
  .catch(error => {
    console.log("=====>This is the error Block")
    // Handle any errors that occurred during the fetch
    console.error('There was a problem with the fetch operation:', error);
  });