def insert_sort(arr):
    cnt = 0
    for i in range(1, len(arr)):
        # i 를 idx에 저장해서 index로 사용
        idx = i
        tmp = arr[i]
        # idx가 0 보다 크고 배열의 idx - 1 번째 값이 tmp값보다 크면 반복
        while idx > 0 and arr[idx - 1] > tmp:
            # 한 번씩 뒤로 밀면서 정렬
            arr[idx] = arr[idx - 1]
            # 정렬되면서 수가 바뀔때마다 카운트 idx 값은 idx-1
            cnt += 1
            idx -= 1
            # 정렬후 cnt 값 확인후 같으면 arr[idx]값이 바뀐 값이므로 arr[idx]값 리턴
            if cnt == k:
                return arr[idx]

        # arr[idx]값이 tmp랑 같은지 확인후 다르면 arr[idx]에 tmp에 저장된 값 삽입 후 카운트 1 더해줌
        if arr[idx] != tmp:
            arr[idx] = tmp
            cnt += 1
            # 카운트 1 더해졌으니 여기서도 카운트 값 확인후 리턴
            if cnt == k:
                return arr[idx]
    return -1


n, k = map(int, input().split())
arr = list(map(int, input().split()))

print(insert_sort(arr))
