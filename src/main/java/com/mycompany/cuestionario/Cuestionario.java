/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuestionario;

/**
 *
 * @author admin
 */
public class Cuestionario {

    private String pregunta; 
    private String respuestaCorrecta; 

    public Cuestionario() {
        this.pregunta = "";
        this.respuestaCorrecta = "";
    }

    public Cuestionario(String pregunta, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
}
