/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theblockchain;

/**
 *
 * @author marti
 */
public class TheBlockChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Bitcoin"));
        blockchain.addBlock(blockchain.newBlock("Ethereum"));
        blockchain.addBlock(blockchain.newBlock("NEO"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);

        // add an invalid block to corrupt Blockchain
        blockchain.addBlock(new Block(15, System.currentTimeMillis(), "aaaabbb", "Block invalid"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
    }
            
}
