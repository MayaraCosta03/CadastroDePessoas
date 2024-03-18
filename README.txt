1. Uma explicação sobre as decisões técnicas e arquiteturais do seu desafio:

R> O JSF foi escolhido como o framework web para a construção do aplicativo, essa decisão foi tomada
devido à sua facilidade de integração com o Java EE, além do uso não tão complicado para a interface.
Além disso, o PrimeFaces foi utilizado na criaçã da interface gráica da aplicação, por acelerar o desenvolvimento,
o uso não tão complicado e os componentes visuais. O Hibernate implementa a persistência de dados do banco feito no PostegreSQL.
Permitindo que fosse desenvolvido os objetos com Java em vez de SQL. Vale lembrar que o PostgreSQL leva o SGBD que foi implementado
na IDE. A injeção EJB permitiu a gestão de depêndencias no projeto e uma maior modularidade que facilitasse a manutenção do código.
Foi utilizado o padrão de arquitetura MVC para separar a lógica de negócio da apresentação dos dados, além do controle das ações do usuário,
facilitando a manutenção e a evolução da aplicação. Também foi utilizado o Maven, como um gerenciador de dependências e da construção do projeto, 
dentro da IDE NetBeans, além dos testes e distribuição da aplicação. As decisões tecnicas foram tomadas vizando principalmente em teoria, que o programa 
fornecesse uma fácil manutenção e uma interface amigável para o usuário final.

2.Uma justificativa para o uso de frameworks ou bibliotecas (caso sejam usadas):

R> A decisão foi tomada devido aos frameworks que fornecem componentes prontos e soluções pré-definidas para problemas comuns, oque vai acelerar o desenvolvimento,
além disso, garante um padrão de boas práticas.Ainda sim, os frameworks e bibliotecas incluem as medidas de segurança integrada, oque reduz o risco de vulnerabilidade do código.
Em suma, o uso de JSF, PrimeFaces, Hibernate e EJB é justificado pela necessidade de desenvolver uma aplicação web escalável e de fácil manutenção e elegância.

3.Instruções sobre como compilar e executar o projeto:
para executar e compilar o projeto, é necessário seguir os seguintes passos:
>1 - Utilize a IDE NetBeans para carregar o projeto.
>2 - selecione "Build" para compilar o projeto.
>3 - Após complicar, clique no projeto e selecione o "Run" para rodar. O NetBeans abrirá um servidor de aplicação embutido no navegador com a página inicial da aplicação, você
pode utilizar as funcionalidades disponíveis. 

REQUISITOS PARA O USO: 
>1 configure corretamente o servidor da aplicação no NetBeans, que no caso foi o Apache Tomcat, antes de executar o programa.
>2 Se houver problemas durante a complicação, verifique os logs do NetBeans para obter mais informações.

4. Instruções sobre como executar os testes da solução:

R> Em "Test Packages" , selecione o pacote que deseja testar e clique em "Test File", para executar como um arquivo de teste. O NetBeans deverá exibir o resultado
dos testes no canto inferior da tela. 

ALGUMAS OBSERVAÇÕES: 

> Observe se os testes estão corretamente configurados e escritos para refletir o comportamento esperado do código.
> Se houver falhas no teste, verifique os detalhes no painel "Test Results", para caso queira identificar os problemas e corrigi-los.
> Manter os testes sempre atualizados regularmente para garantir a qualidade do código. 
> Lembrando que essas instruções são para a IDE NetBeans. 

5. Notas adicionais que você considere importantes para a avaliação:

R> Considerei fazer o código o mais funcional e implementado possível, mas mantendo a filosofia de clean code e separando bem cada
pacote e suas classes. Tentei também deixar a interface gráfica simples, intuitiva e responsiva, algo que atende-se aos requisitos do teste. 
Com base nas minhas limitações de Desenvolvedora Junior, apesar do pouco tempo para realizar uma tarefa tão ousada, tentei manter os parametros desejados, 
procurando deixar a documentação o mais clara possível para o entendimento e sempre adotando boas práticas de desenvolvimento. Almejo que eu possa novamente ter
a oportunidade de desenvolver para a Sinerji, com um melhor tempo para desenvolver um código bem mais atraente e mais implementado. Agradeço a oportunidade de fazer 
parte desse processo seletivo e peço para que a empresa considere minhas habilidades com carinho.

Atenciosamente, Mayara da Costa Santos. 