Feature: Log
    As como usuario do sistema desejo logar

		@positive
    Scenario: Deve realizar login com sucesso
        Given que eu tenha acesso ao sistema
        When informar meu usuario "student"
        And informar minha senha "Password123"
        And clicar no botao entre
        Then deve abrir a pagina de sucesso de login
        
    @negative   
    Scenario: Login com usuario invalido
    		Given que eu tenha acesso ao sistema
    		When informar meu usuario "studente"
				And informar minha senha "Password123"
        And clicar no botao entre
        Then o sistema retornara uma mensagem de error "Your username is invalid!"
        
    @negative    
    Scenario: Login com senha invalida
    		Given que eu tenha acesso ao sistema
    		When informar meu usuario "student"
				And informar minha senha "Password1234"
        And clicar no botao entre
        Then o sistema retornara uma mensagem de error "Your password is invalid!"