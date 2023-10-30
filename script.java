document.getElementById('login-form').addEventListener('submit', function(event) {
  event.preventDefault();

  var phone = document.getElementById('phone-input').value;
  var password = document.getElementById('password-input').value;

  var messageElement = document.getElementById('message');

  if (phone === '87081551514' && password === '123456789') {
    messageElement.innerText = 'Привет, ' + phone + '!';
    messageElement.style.display = 'block';
  } else {
    messageElement.innerText = 'Неверный номер или пароль';
    messageElement.style.display = 'block';
  }
});