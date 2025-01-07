```toml
name = 'Update product'
method = 'PUT'
url = 'http://localhost:8080/products/3'
sortWeight = 4000000
id = 'b7a4e136-1153-4df5-84a9-3b62ae8dbc96'

[body]
type = 'JSON'
raw = '''
{
  title: "iPhone 15",
  category: "Smartphone",
  price: 56565
}'''
```
