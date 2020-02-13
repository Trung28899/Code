// Book Class: Represents a Book
class Book {
  constructor(title, author, isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }
}

// Book Storage
var Books = [];
Books[0] = new Book("Demo Book", "Demo Author", "123456");
var count = 0;

// AddBook:
document.querySelector("#book-form").addEventListener("submit", addBooks);
function addBooks(e) {
  // prevent the default action to clear the form
  e.preventDefault();
  const title = document.querySelector("#title").value;
  const author = document.querySelector("#author").value;
  const isbn = document.querySelector("#isbn").value;

  var newBook = new Book(title, author, isbn);

  Books.push(newBook);
  count++;
  addBooksUI(Books[count]);
}

addBooksUI(Books[0]);
var counter = 0;
function addBooksUI(book) {
  const list = document.querySelector("#book-list");
  // creating row
  const row = document.createElement("tr");

  // adding columns in the rows
  row.innerHTML = `            
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
        <td><a href="#" class="btn btn-danger btn-sm delete">X</a></td>
        `;

  list.appendChild(row);
}

// Remove Book:
document.querySelector("#book-list").addEventListener("click", e => {
  removeBooks(e.target);
});

function removeBooks(el) {
  if (el.classList.contains("delete")) {
    // try el.parentElement.remove(); to see what happens
    el.parentElement.parentElement.remove();
  }
}
