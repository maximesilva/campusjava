# Microservices

Qu'est ce que s'est ?


Un microservice est un morceau spécifique d'une application destinée à faire qu'une seule chose.
Cette application est donc découpé en de multiples microservices indépendant.

L'avantage ?


L'autonomie de chacun de ces microservices. Si vous avez besoin de plus de performances concernant l'authentification, par exemple,
vous aurez qu'a augmenter le nombre de microservices destiné à l'authentification pour rendre votre site plus efficace. Il suffit juste de multiplier
le microservice en question !

![alt text](https://user.oc-static.com/upload/2018/03/05/15202798128998_p01-figure02.jpg "Logo Title Text 1")


Donc, chaque microservice fonctionne indépendamment, chacun à sa propre base de donnée, son propre serveur, ses dépendances, etc...
Si un microservice vient à buguer, il n'impactera pas directement les autres, à part si les autres sont dépendant de celui-ci.

# Annotation

#### @Entity


Utilisée pour spécifier que la classe d'annotation actuelle représente un type d'entité.


#### @Id


Spécifie l'identificateur d'entité. Une entité doit toujours avoir un attribut d'identificateur, qui est utilisé lors du chargement de l'entité


#### @GeneratedValue


Spécifie que la valeur d'identificateur d'entité est automatiquement générée


#### @JsonIgnore


Permet d'ignorer un paramètre de l'entité, pour ne pas qu'il soit prit en compte.


#### @Override


Utilisé pour définir une méthode qui est héritée de la classe parente


#### @Controller


Permet de déclarer que la classe suivante est un contrôleur Spring


#### @RestController


Est une version spécialisée du contrôleur. Il inclut les annotations @Controller et @ResponseBody et, par conséquent, simplifie l'implémentation du contrôleur


#### @Autowired


Permet de faire l’injection de dépendances


#### @RequestMapping


Cette annotation mappe les requêtes HTTP aux méthodes de gestion des contrôleurs MVC et REST.


#### @GetMapping


Raccourci pour @RequestMapping(method = RequestMethod.GET)


#### @PostMapping


Raccourci pour @RequestMapping(method = RequestMethod.POST)


#### @PutMapping


Raccourci pour @RequestMapping(method = RequestMethod.PUT)


#### @DeleteMapping


Raccourci pour @RequestMapping(method = RequestMethod.DELETE)


#### @Test


Déclare un test


#### @Query


Pour exécuter du SQL natif


#### @PathVariable


Permet d'extraire les variables utilisé dans une URI


#### @RequestBody


Permet de désérialiser le corps de la requète


#### @Repository


Permet de pouvoir utiliser les méthodes de CRUD de JPA