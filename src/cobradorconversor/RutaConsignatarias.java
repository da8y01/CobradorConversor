/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cobradorconversor;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class RutaConsignatarias {

    private String Fecha;
    private String Cobrador;
    private Vector VectorRazonSocial;
    private String Message;


    public RutaConsignatarias() {
        //JSONStringToObject(sJSON);
    }


    public String GetFecha() {
        return this.Fecha;
    }

    public void SetFecha(String fecha) {
        this.Fecha = fecha;
    }


    public String GetCobrador() {
        return this.Cobrador;
    }

    public void SetCobrador(String cobrador) {
        this.Cobrador = cobrador;
    }


    public Vector GetVectorRazonSocial() {
        return this.VectorRazonSocial;
    }

    public void SetVectorRazonSocial(Vector razonessociales) {
        this.VectorRazonSocial = razonessociales;
    }


    public String GetMessage() {
        return this.Message;
    }

    public void SetMessage(String message) {
        this.Message = message;
    }

}
