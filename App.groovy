
// https://anders.com/blockchain/

List<String> data = ['hello', 'world']

Block b

data.each {
	b = new Block(it, b)
	b.mine()

	println ''
	println 'Found valid block'
	println '---------------------'
	println b.previousBlock?.hash
	println b.nonce
	println b.hash
	println b.data
	println '---------------------'
}
