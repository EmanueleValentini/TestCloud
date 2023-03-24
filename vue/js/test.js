axios.get("http://localhost:8080/user/1")
  .then(function (response) {
    // handle success
    console.log(response.data);
  })
  .catch(function (error) {
    // handle error
    console.log(error);
});

  console.log(21);