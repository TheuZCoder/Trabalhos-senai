document.getElementById("loginBtn").addEventListener("click", function () {
  document.getElementById("loginModal").style.display = "block";
});

document.getElementById("closeBtn").addEventListener("click", function () {
  document.getElementById("loginModal").style.display = "none"
});

document.getElementById("loginForm").addEventListener("submit", function(event) {
  event.preventDefault(); // Evita que o formulário seja enviado

  var username = document.getElementById("username").value;
  var password = document.getElementById("password").value;

  // Verifica o nome de usuário e senha
  if (username === "usuariodeexemplo" && password === "senhadeexemplo") {
    // Login bem-sucedido
    alert("Login bem-sucedido!");
    // Adicione aqui o redirecionamento para a página restrita ou atualização da interface para mostrar o conteúdo restrito
  } else {
    // Login inválido
    alert("Nome de usuário ou senha incorretos. Por favor, tente novamente.");
  }
});







