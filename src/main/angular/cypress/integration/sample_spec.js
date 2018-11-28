describe('it loads the page', () => {
    it('show image', () => {
        cy.visit('http://localhost:4200');
        cy.contains('Welcome');
        cy.get('h1')
        .should('contain', 'Welcome');

    });
});