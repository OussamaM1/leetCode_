package decodexoredarray

func decode(encoded []int, first int) []int {
	undecoded := []int{}
	undecoded = append(undecoded, first)
	for i := 0; i < len(encoded); i++ {
		undecoded = append(undecoded, undecoded[i]^encoded[i])
	}
	return undecoded
}
