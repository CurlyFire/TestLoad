def sayHi()
{
    return "hi"
}

return [sayHi : this.&sayHi]