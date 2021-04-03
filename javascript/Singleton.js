class Singleton {
    constructor() {
      if (!Singleton.instance) {
        Singleton.instance = this;
      }
      return Singleton.instance;
    }
    static getInstance() {
      return this.instance;
    }
}

const sing1 = new Singleton()
const sing2 = new Singleton()

console.log(sing1 === sing2)

