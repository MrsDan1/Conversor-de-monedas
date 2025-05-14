# Conversor-de-monedas
Un reto de Alura sobre java, apis, etc. un conversor de monedas funcional con una api sencilla.

Como conseguir tu API
Ingresá a Exchangerate
Hacé click en "Get Free API Key"
Registrate con tu email
Una vez logueado, recibirás tu clave (API Key) en el dashboard
📦 Instalación y configuración
1. Clonar el repositorio
git clone https://github.com/aquilescb/conversor_de_monedas
cd conversor_de_monedas
2. Configurar tu propia API Key
Creá un archivo llamado config.properties dentro de la carpeta src Dentro de ese archivo, agregá API_KEY y luego tu clave generada:

API_KEY=TU_CLAVE_AQUI
3. Instalar la libreria GSON
Descargá el archivo .jar de GSON desde este enlace: GSON (Recomendacion:descargar la última version)
En IntelliJ IDEA:
Ir a file> Project Structre > Modules > Dependencies
Hacer clic en el boton "+" y seleccionar "JARs or directories"
Elegi el archivo .jar descargado
Aplica los cambio
▶️ Ejecutar el programa
Desde IntelliJ IDEA

Asegurate de tener config.properties accesible en el classpath.
Ejecutá la clase ConversorApp
