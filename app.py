from flask import Flask, request

app = Flask(__name__)

@app.route('/api/authenticate', methods=['POST'])
def authenticate():
    phone = request.form['phone']
    password = request.form['password']

    # У вас должен быть код для проверки введенного логина и пароля
    # Если аутентификация успешна, возвращайте соответствующий ответ

    return {'message': 'Успешная аутентификация'}
  
if __name__ == '__main__':
    app.run()