document.getElementById("loginBtn").addEventListener("click", function () {
  document.getElementById("loginModal").style.display = "block";
  document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Evita que o formulário seja enviado
  
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
  
    // Verifica o nome de usuário e senha
    if (username === "aaa" && password === "aaa") {
      // Login bem-sucedido
      alert("Login bem-sucedido!");
      var loginModal = document.getElementById("loginModal");
        loginModal.style.display = "none";
      
      // Adicione aqui o redirecionamento para a página restrita ou atualização da interface para mostrar o conteúdo restrito
    } else {
      // Login inválido
      alert("Nome de usuário ou senha incorretos. Por favor, tente novamente.");
    }
  });
});
  
document.getElementById("closeBtn").addEventListener("click", function () {
  document.getElementById("loginModal").style.display = "none"
});









