<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario Moderno</title>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Montserrat', sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        label {
            margin-top: 15px;
            color: #555;
            display: block;
        }

        input, textarea {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
            box-sizing: border-box;
        }

        button {
            margin-top: 20px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px 15px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
        }

        #display-data {
            margin-top: 20px;
            background-color: #e9ecef;
            padding: 15px;
            border-radius: 4px;
        }
    </style>
</head>
<body>

    <h1>Formulario Básico</h1>
    <form action="/process-form.php" method="post">
        <label for="name">Nombre:</label>
        <input type="text" id="name" name="user_name" pattern="[a-zA-Z ]+" required />

        <label for="mail">Correo electrónico:</label>
        <input type="email" id="mail" name="user_mail" required />

        <label for="msg">Mensaje:</label>
        <textarea id="msg" name="user_message" rows="4" required></textarea>

        <button type="submit">Enviar</button>
    </form>

    <div id="display-data">
        <!-- Acá se mostrará la información ingresada -->
    </div>

</body>
</html>
