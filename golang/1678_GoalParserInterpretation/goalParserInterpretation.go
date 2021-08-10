package goalparserinterpretation

func interpret(command string) string {
	ans := []byte{}
	for i := 0; i < len(command); i++ {
		if command[i] == 'G' {
			ans = append(ans, 'G')
		} else if command[i] == '(' {
			if command[i+1] == ')' {
				ans = append(ans, 'o')
			} else {
				ans = append(ans, 'a')
				ans = append(ans, 'l')
			}
		}
	}
	return string(ans)
}
