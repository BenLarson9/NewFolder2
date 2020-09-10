using UnityEngine;
using UnityEngine.AI;
using UnityEngine.UI;

public class DeathScript : MonoBehaviour
{
    public Transform player;
    NavMeshAgent agent;
    Animator animator;
    Rigidbody rb;

    void Start()
    {
        agent = gameObject.GetComponent<NavMeshAgent>();
        animator = gameObject.GetComponent<Animator>();
        animator.SetBool("run", true);
    }

    void Update()
    {
        agent.SetDestination(player.position);

        if (Vector3.Distance(gameObject.transform.position, player.position) <= 8)
        {
            if (!animator.GetCurrentAnimatorStateInfo(0).IsName("attack_01"))
            {
                animator.SetBool("attack_01", true);
            }
        }
        else
        {
            if (!animator.GetCurrentAnimatorStateInfo(0).IsName("run"))
            {
                animator.SetBool("run", true);
            }
        }
    }

}
