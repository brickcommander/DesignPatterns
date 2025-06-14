Adapter Design Pattern (Structural Design Pattern)
- Acts as a Bridge between two uncompatible objects
- Or We can also say that it's a bridge between an ExistingInterface and ExpectedInterface
- Example:
    1) Power Adapter and a Socket
    - Power Socket with 2 pin
    - Power Plug with 3 pins
    - So to make both work, we will put a adapter between them
    2) XML to JSON Parser
    - Client Want JSON
    - Server Returns XML
    - Need Adapter to make these compatible