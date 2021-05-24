#!/usr/bin/env python
# -*- coding: utf-8 -*-

#==============================================================================
# Exemple d'une fabrique abstraite d’élément en Python
#==============================================================================

class ProduitA(object):
    def creer_produitA(self):
        raise NotImplementedError()


class ProduitA1(ProduitA):
    def creer_produitA(self):
        return ProduitB1()


class ProduitA2(ProduitA):
    def creer_produitA(self):
        return ProduitB2()


class ProduitA3(ProduitA):
    def creer_produitA(self):
        return ProduitB3()


class ProduitB(object):

    def creer_produitB(self):
        raise NotImplementedError()


class ProduitB1(ProduitB):
    def creer_produitB(self):
        return "Produit B1" 


class ProduitB2(ProduitB):
    def creer_produitB(self):
        return "Produit B2"


class ProduitB3(ProduitB):
    def creer_produitB(self):
        return "Produit B3"
