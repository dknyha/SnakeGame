# SnakeGame 
Цей проект - це проста реалізація класичної гри "Змійка" (Snake) за допомогою мови програмування Java та графічної бібліотеки Swing. Давайте розглянемо його основні компоненти:

MainWindow (Головне вікно):
- Цей клас розширює JFrame, щоб створити головне вікно програми.
- У конструкторі встановлюються розміри вікна, його назва ("Snake") та операція закриття за замовчуванням.
- Ініціалізується об'єкт класу GameField та додається до головного вікна.
- main метод викликає конструктор MainWindow, запускаючи програму.

GameField (Ігрове поле):
- Цей клас розширює JPanel і представляє собою область для відображення гри.
- У конструкторі встановлюється фон (чорний), завантажуються зображення яблука та краплини змійки, ініціалізується гра.
- Метод initGame() встановлює початкові значення для змійки та запускає таймер для оновлення гри.
- Метод createApple() випадковим чином визначає нове положення яблука на ігровому полі.
- Метод loadImages() завантажує зображення яблука та краплини змійки з файлів.
- paintComponent відповідає за відображення гри на ігровому полі. Він малює змійку та яблуко.
- move() переміщує змійку в залежності від напрямку, в якому вона рухається.
- checkApple() перевіряє, чи змійка з'їла яблуко, і збільшує розмір змійки, якщо так.
- checkCollisions() перевіряє, чи зіткнулася змійка зі стіною або з собою, і встановлює змінну inGame відповідно.
- actionPerformed() є методом з інтерфейсу ActionListener і викликається таймером для оновлення стану гри.
- FieldKeyListener - клас внутрішнього слухача подій, який відслідковує натискання клавіш гравцем і змінює напрямок руху змійки відповідно.

Цей проект демонструє використання Java та бібліотеки Swing для створення простої гри.
