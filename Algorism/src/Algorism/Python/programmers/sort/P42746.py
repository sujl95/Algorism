numbers1 = [6, 2, 10]

def solution(numbers):
    answer = ''
    a = []
    for i in range(len(numbers)):
        a.append(str(numbers[i]))
    a.sort(key=lambda x: x * 3, reverse=True)
    answer = str(int(''.join(a)))
    return answer

print(solution(numbers1))
