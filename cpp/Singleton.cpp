class Singleton {
    private : 
        Singleton instance;
};

int Singleton::instance() {
    return 1;
};
