```python
dict = {'Name':'AAAlice','Age':'20','School':'UJS'}

dict.pop('Age')

dict['School']='jiangsudaxue'

dict['Class']='2001'

dict['Name']=list('AAAlice')

dict['Name'][:2]=[]

dict['Name']=''.join(dict['Name'])

for key,val in dict.items():

  print(key,' ',val)
```

