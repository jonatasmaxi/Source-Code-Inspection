/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.ticketmachine;

import br.calebe.ticketmachine.core.PapelMoeda;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41404998
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
   
    }
    @Test
    public void inicializacaoTest(){
        PapelMoeda papelMoeda = new PapelMoeda(50,3);
        Assert.assertEquals(3, papelMoeda.getQuantidade());
        Assert.assertEquals(50, papelMoeda.getValor());
    }
}
