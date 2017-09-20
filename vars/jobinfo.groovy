def setName(value) {
    privateName = ['ORG': 'FUN', 'SPACE': 'webapi'] 
    echo "Setting name to ${privateName}"
}
def getName() {
    privateName
}
