```toml
name = 'Create Employee'
method = 'POST'
url = 'http://localhost:8080/employees'
sortWeight = 1000000
id = 'c7d9f33e-9215-43fd-942a-d6188cf16e22'

[body]
type = 'JSON'
raw = '''
{
  id: 1,
  empName: "John Smith",
  empEmail: "john@email.com",
  empSalary: 34333
}'''
```
