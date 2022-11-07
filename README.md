# Statement of Integrity

This project is authored by Mayank Ravishankara with independant and individual contributions. While documentations, online examples, other projects were referred, the entire codebase is solely architected by Mayank. No known plagiarism was made.

# Getting Started 

To set up the backend server running,

```
cd walmartbackend
mvn spring-boot:run
```
Now on your browser/curl check if localhost:8080/search?term=berry gets a list of product ids.

To set up frontend server running,

```
cd walmart-frontend
npm install
npm start
```

The browser should open localhost:3000

# How to use

On the browser, you see a search bar. Enter a term to search (Ex: 'a', 'ab', 'cream', )

First 10 search results will be displayed.

Click on any of the search result to go the product details page.

Product details and recommendations of similar products is shown (First 10 results only).

# Backend Logic

3 endpoints: /search, /product & /recommend

/search?term=:term will search all records to see if the title contains the search term in it and displays the list of product ids whose title contains the search term.

/product?id=:id will get the product details for given product id.

/recommend?id=id will recommend other products. As a placeholder logic only 20 random product ids are sent as recommendations (which is furhter only reduced to 10 in the frontend).
