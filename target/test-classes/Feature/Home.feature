Feature: Affichage d'un sous-menu

  Scenario: Lister les options d un sous-menu
    Given que je suis bien connecte avec login"Admin" et mdp "admin123" donc je sur la page Home 
    When je sélectionne la list de sous-menu "<sousmenu>"
    Then je vois les options suivantes dans le sous-menu:
      | Admin |
      | PIM |
      | Leave |
      | Time |
      | Recruitment |
      | My Info |
      | Performance |
      | Dashboard |
      | Directory |
      | Maintenance |
      | Claim |
      | Buzz |
