
class Block {

	Block previousBlock

	String data

	int nonce
	String hash

	Block(String data, Block previousBlock = null) {
		this.previousBlock = previousBlock
		this.data = data
		this.nonce = 0
	}

	void mine() {
		while({
			this.nonce++
			//println this.data + ' ' + this.nonce

			calculateHash()
			
			!valid
		}()) continue
	}

	boolean isValid() {
		this.hash.startsWith('0000')
	}

	void calculateHash() {
		this.hash = (this.previousBlock?.hash + '###' + this.data + '###' + this.nonce).md5() //.digest('SHA-256')
		//println this.hash
	}

}