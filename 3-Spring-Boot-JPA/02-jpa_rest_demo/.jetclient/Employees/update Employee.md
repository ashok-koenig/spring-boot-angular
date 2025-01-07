```toml
name = 'update Employee'
method = 'PUT'
url = 'http://localhost:8080/employees/2'
sortWeight = 4000000
id = '18fab1ea-c65b-4dd4-9856-67e97109a6e3'

[body]
type = 'JSON'
raw = '''
{
  empName: "Ana",
  empEmail: "ana@email.com",
  empSalary: 23433
}'''
```
