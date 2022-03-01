from unittest import result


'''
# return multiple variable using ','
def multiple():
    operation = "Sum"
    result = 5+10
    # return operation,result
    return [operation, result]


#operation, result = multiple()
result_list = multiple()
# print(operation, result)
print(result_list)
print(result_list[0])
print(result_list[1])
'''


def multiple():
    mydict = dict()
    operation = "Sum"
    result = 5+10
    mydict['operation'] = operation
    mydict['result'] = result
    return mydict


result_dict = multiple()
print(result_dict)
