class FabriqueAbstraite{
    constructor(){
        if (this.constructor === FabriqueAbstraite) {
            throw new TypeError('Abstract class cannot be instantiated directly');
          }
    }
}

class FabriqueConcrete1 extends FabriqueAbstraite {
    creerProduitA(){
        return new ProduitA1();
    }

    creerProduitB(){
        return new ProduitB1();
    }
}

class FabriqueConcrete2 extends FabriqueAbstraite {
    creerProduitA(){
        return new ProduitA2();
    }

    creerProduitB(){
        return new ProduitB2();
    }
}

class ProduitAbstraitA {
    constructor(){
        if (this.constructor === ProduitAbstraitA) {
            throw new TypeError('Abstract class cannot be instantiated directly');
          }
    }
}

class ProduitA1 extends ProduitAbstraitA{
    constructor(){
        super();
        console.log("Je suis un produit A1");
    }
}

class ProduitA2 extends ProduitAbstraitA{
    constructor(){
        super();
        console.log("Je suis un produit A2");
    }
}

class ProduitAbstraitB {
    constructor(){
        if (this.constructor === ProduitAbstraitB) {
            throw new TypeError('Abstract class cannot be instantiated directly');
        }
    }
}

class ProduitB1 extends ProduitAbstraitB {
    constructor(){
        super();
        console.log("Je suis un produit B1");
    }
}

class ProduitB2 extends ProduitAbstraitB {
    constructor(){
        super();
        console.log("Je suis un produit B2");
    }
}


let fabriqueConcrete1 = new FabriqueConcrete1();
fabriqueConcrete1.creerProduitA();

