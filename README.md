Parcial AREP Segundo Tercio

Se hace la implementación de un servidor Proxy, que se conecta con dos instancias 
distintas del servicio MathService. en caso de que la instancia principal no este en 
funcionamiento se llama a la instancia secundaria (activo-pasiva).
<img width="1628" height="97" alt="image" src="https://github.com/user-attachments/assets/95c52d76-48ce-47d0-b067-a7fde3efc72b" />
Cada una de las instancias se despliega en su propia EC2, en el caso de las instancias de 
MathService, las instancias de EC2 estan asociadas a una Elastic IP para que su
ip no cambie con el tiempo.

Pruebas de funcionamiento

Obtener factores de un numero:

<img width="391" height="169" alt="image" src="https://github.com/user-attachments/assets/7519d181-351a-44c7-a5a3-5b91d87dccb4" />

<img width="417" height="171" alt="image" src="https://github.com/user-attachments/assets/349f5703-51c8-4461-b677-258aa7afabdd" />

Obtener numeros primos

<img width="832" height="179" alt="image" src="https://github.com/user-attachments/assets/9cb79246-49cb-4752-992b-fa80522ad77c" />

<img width="1162" height="241" alt="image" src="https://github.com/user-attachments/assets/3a9128c9-f03b-43c2-b9f4-44b995de9a55" />

Servicio desplegado

<img width="1122" height="439" alt="image" src="https://github.com/user-attachments/assets/f6189dde-1840-4fcc-8a57-8afe7923437b" />

Funcionamiento con instancia principal apagada

<img width="1636" height="125" alt="image" src="https://github.com/user-attachments/assets/c42c26c3-257b-4d90-8a17-ae3eeffe002e" />

<img width="527" height="246" alt="image" src="https://github.com/user-attachments/assets/e9f334ad-411d-4a6c-9e9e-73034d9ec2a8" />

Para correr los servicios se corre los siguientes comandos

git clone https://github.com/JaiderVargas05/Parcial2-AREP.git

cd Parcial2-AREP/{servicio}

sudo java -jar target/{servicio}-0.0.1-SNAPSHOT.jar




