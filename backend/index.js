const express = require('express');
const cors = require('cors');
const app = express();

app.use(cors());
app.use(express.json());

// Esta es la ruta que recibe los datos del formulario
app.post('/registrar', (req, res) => {
    console.log("Datos recibidos del estudiante:", req.body);
    res.json({ mensaje: "Estudiante registrado correctamente" });
});

app.listen(5000, () => {
    console.log("Servidor Node en puerto 5000 corriendo perfectamente");
});