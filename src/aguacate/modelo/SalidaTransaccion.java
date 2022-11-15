
package aguacate.modelo;

import java.security.PublicKey;


public class SalidaTransaccion {
    
    
    
    /*
    * Los resultados de la transacción mostrarán la cantidad final enviada a cada parte desde la transacción.
    *  Estos, cuando se hace referencia como entradas en nuevas transacciones,
    *  actúan como prueba de que tiene monedas para enviar.
    * */

    public String id;
    public PublicKey reciepient; //also known as the new owner of these coins.
    public float value; //the amount of coins they own
    public String parentTransactionId; //the id of the transaction this output was created in

    //Constructor
    public SalidaTransaccion(PublicKey reciepient, float value, String parentTransactionId) {
        this.reciepient = reciepient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
        this.id = StringUtil.applySha256(StringUtil.getStringFromKey(reciepient)+Float.toString(value)+parentTransactionId);
    }

    //Check if coin belongs to you
    public boolean isMine(PublicKey publicKey) {
        return (publicKey == reciepient);
    }
    
    
}
