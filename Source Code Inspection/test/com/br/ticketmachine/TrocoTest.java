/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ticketmachine;

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.Troco;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41404998
 */
public class TrocoTest {
    
    public TrocoTest() {
    }
  
    @Test
    public void inicializacaoTest(){
        Troco troco = new Troco(13);
        /*Impossibilidade de testar a inicialização de troco.
        Método getValor() para identificar se objeto foi instanciado corretamente
        */
    }
    @Test
    public void inicializacaoNegativaTest(){
        Troco troco = new Troco(13);
        /*Impossibilidade de testar a inicialização de troco.
        Método getValor() para identificar se objeto foi instanciado corretamente
        */
    }
    
    @Test
    public void verificarTrocoTest(){
        Troco troco = new Troco(23);
        PapelMoeda[] atual = troco.getPapeisMoeda();
        System.out.println(atual);
        /*Impossível criar cenário de teste.
        Falta do método toString() para verificar se o vetor troco está populado corretamente */
        
    }
}
