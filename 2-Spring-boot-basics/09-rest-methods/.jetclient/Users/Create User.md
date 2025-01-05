```toml
name = 'Create User'
method = 'POST'
url = 'http://localhost:8080/users'
sortWeight = 2000000
id = '4d523e50-3bc3-4611-97d9-aa819fc62818'

[body]
type = 'JSON'
raw = '''
{
  id: 1,
  name: "John",
  email: "john@email.com"
}'''
```
