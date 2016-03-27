package br.calebe.ticketmachine.core;

import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HugoKeniti
 */
 public class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator() {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            for (int i = 6; i >= 0; i++) {
                if (troco.getPapeisMoeda()[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.getPapeisMoeda()[i] != null) {
                    ret = troco.getPapeisMoeda()[i];
                    troco.getPapeisMoeda()[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            next();
        }
        public Iterator<PapelMoeda> getIterator() {
            return new TrocoIterator();
    }
      
    }
