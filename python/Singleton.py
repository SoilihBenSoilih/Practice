class Singleton(object):

    instance = None   

    #called on the creaction of an object
    def __new__(cls):
        if cls.instance is None:
            cls.instance = object.__new__(cls)
        return cls.instance

        
        