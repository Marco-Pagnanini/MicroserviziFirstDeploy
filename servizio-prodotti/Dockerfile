# Usiamo Eclipse Temurin (versione leggera Alpine) che funziona ovunque
FROM amazoncorretto:17
# Assicurati che il nome del jar sia corretto (quello che hai visto nella cartella)
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]