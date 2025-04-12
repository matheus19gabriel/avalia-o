
a) Por que o uso de herança foi importante neste projeto?

   A herança permitiu que as classes CamisetaSimples e CamisetaEstampada reutilizassem os atributos e comportamentos
   da classe Camiseta, evitando duplicação de código. Assim, mantemos uma estrutura mais organizada e fácil de manter.

b) Como o polimorfismo foi aplicado e como isso torna o sistema mais flexível?

   O polimorfismo foi aplicado através do método abstrato calcularDesconto(), que é implementado de forma diferente
   em cada subclasse. Isso permite que possamos tratar diferentes tipos de camisetas de maneira uniforme (como em uma lista),
   mas ainda assim aplicar regras específicas para cada tipo. Isso torna o sistema flexível e fácil de estender com novos tipos
   de camisetas e descontos no futuro.
