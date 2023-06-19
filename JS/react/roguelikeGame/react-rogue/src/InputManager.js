class InputManager{
    observers =[]

    subscribe(fn){
        this.observers.push(fn)
    }
    unSubscribe(fn) {
        this.observers = this.observers.filter((subscriber) => subscriber !== fn);
    }
    broadCasts(action, data) {
        this.observers.forEach((subscriber) => subscriber(action, data));
    }
    handleKeys = (e) =>{
        e.preventDefault();
        switch (e.keyCode) {
            case 37:
                this.broadCasts('move',{x:-1,y:0})
                break;
            case 38:
                this.broadCasts('move',{x:0,y:-1})
                break;
            case 39:
                this.broadCasts('move',{x:1,y:0})
                break;
            case 40:
                this.broadCasts('move',{x:0,y:1})
                break;
            default:
                break;
        }
    }
    bindKeys() {
        document.addEventListener("keydown", this.handleKeys);
    }
    
    unbindKeys() {
        document.removeEventListener("keydown", this.handleKeys);
    }
}

export default InputManager;