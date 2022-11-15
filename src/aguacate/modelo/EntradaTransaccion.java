
package aguacate.modelo;


public class EntradaTransaccion {
   
    /*
    * Esta clase se utilizará para hacer referencia a los rendimientos
    * de transacciones que aún no se han gastado.
    * El transactionOutputId se utilizará para encontrar la TransactionOutput relevante,
    * lo que permitirá a los mineros comprobar su propiedad.
    * */
    
    public String transactionOutputId; //Reference to TransactionOutputs -> transactionId
    public SalidaTransaccion UTXO; //Contains the Unspent transaction output

    public EntradaTransaccion(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}
